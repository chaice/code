package com.chat.client;

import java.io.BufferedReader;
import java.io.IOException;

public class Accept implements Runnable {
	public BufferedReader br;

	public Accept(BufferedReader br) {
		super();
		this.br = br;
	}

	@Override
	public void run() {
        while(true){
        	try {
				String mes = br.readLine();
				if(mes !=  null){
					System.out.println(mes);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

	}
}
