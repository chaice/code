package com.ccit.client;

import java.io.BufferedReader;
import java.io.IOException;

public class Accept implements Runnable{
	private BufferedReader br;

	public Accept(BufferedReader br) {
		super();
		this.br = br;
	}

	@Override
	public void run() {
		while(true){
		String mes;
		try {
			mes = br.readLine();
			if(mes != null ){
				System.out.println(mes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}
	
	

}
