package persistence;

import java.sql.Connection;

import com.main.Conta;

import model.ConnectionFactory;

public class ContaDao extends Conta{
	
	Connection conn;
	
	public ContaDao ()
	{
		this.conn = new ConnectionFactory().getConnection();
	}

	@Override
	public int insertConta() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateConta() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delateConta() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void selectConta() {
		// TODO Auto-generated method stub
		
	}

}
