package com.demo.repository;

import java.util.ArrayList;

import com.demo.entidades.Vendedores;

public class VendedoresRepository {

	private ArrayList<Vendedores> vendedor =new ArrayList<Vendedores>();

	public VendedoresRepository(){
		vendedor.add(new Vendedores("923","098888","Juan",100));
		vendedor.add(new Vendedores("924","097777","Carmen",345));
		vendedor.add(new Vendedores("925","096666","Jose",402));
	}

	public void ingresar(Vendedores vende){
		vendedor.add(vende);
	}

	public ArrayList<Vendedores> getVendedore(){
		return vendedor;
		
	}

	public Vendedores getVendedores(String codigo){
		for(int i=0;i<vendedor.size();i++){
			if(vendedor.get(i).getCodigo().equals(codigo))
				return vendedor.get(i);
		}
		return null;
	}
}
