package com.biz.market;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.model.MarketVO;

public class Market_01 {

	List<MarketVO> maList;
	String scoreFile="src/com/biz/inout/매입매출.txt";
	FileReader fileReader;
	BufferedReader buffer;
	
	public void market() {
		try {
			maList=new ArrayList<MarketVO>();
			fileReader=new FileReader(scoreFile);
			buffer=new BufferedReader(fileReader);
			String reader="";
			
			while(true) {
				reader=buffer.readLine();
				if(reader==null) break;
				
				MarketVO vo=new MarketVO();
				String[] scores=reader.split(":");
				vo.setWh(scores[0]);
				vo.setName(scores[1]);
				vo.setMa(scores[2]);
				vo.setGa(Integer.valueOf(scores[3]));
				vo.setFa(Integer.valueOf(scores[4]));
				maList.add(vo);
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void sumMarket() {
		int intLen=maList.size();
		for(int i=0;i<intLen;i++) {
			if(maList.get(i).getMa().equals("1")) {
				maList.get(i).setMa("매입");
				int sum=maList.get(i).getGa()*maList.get(i).getFa();
				maList.get(i).setDa(sum);
			
			}else {
				maList.get(i).setMa("매출");
				int sum=maList.get(i).getGa()*maList.get(i).getFa();
				maList.get(i).setSa(sum);

				
			}
			
		}
		
		
	}
	public void viewMarket() {
		
		System.out.println("========================================================================");
		System.out.println("거래일자\t구분\t상품명\t단가\t수량\t매입금액\t매출금액");
		System.out.println("------------------------------------------------------------------------");
		for(MarketVO vo: maList) {
			System.out.printf("%s\t%s\t%s\t%d\t%d\t%d\t%d\n",vo.getWh(),vo.getMa(),vo.getName(),
					vo.getGa(),vo.getFa(),vo.getDa(),vo.getSa());
		}
		
	}
	
	
}
