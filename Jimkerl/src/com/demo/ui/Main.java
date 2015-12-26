package com.demo.ui;

import java.util.ArrayList;

import com.demo.entidades.Vendedores;
import com.demo.repository.VendedoresRepository;

public class Main {

	public static void main(String[] args) {
		VendedoresRepository vendedorRepository=new VendedoresRepository();
		Vendedores vd1=new Vendedores("928","095555","Luis",195);
		Vendedores vd2=new Vendedores("929","094444","Pedro",200);
		
		vendedorRepository.ingresar(vd1);
		vendedorRepository.ingresar(vd2);
		
		ArrayList<Vendedores> temp=vendedorRepository.getVendedore();
		
		for(int i=0;i<temp.size();i++){
			System.out.println(temp.get(i));
		}

		}
}
