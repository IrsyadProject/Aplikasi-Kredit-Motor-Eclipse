package com.example.project_kreditmotor_farihahamaliafikriafridaerviana;


public class Motor extends Koneksi{
	private long id;
	Server server = new Server();
	
	String SERVER = server.urlDatabase1();
	String URL = "http://" + SERVER +"/jskreditmotor/tbmotor.php";
	String url = "";
	String response = "";
	
	//Tampil Motor
	public String tampilMotor(){
		try{
			url = URL + "?operasi=view";
			System.out.println("URL Tampil Motor: " + url);
			response = call(url);
		}catch(Exception e){
		}
		return response;
	}
	
	//Tampil Motor by id nama
	public String tampilMotorbyIdNama(){
		try{
			url = URL + "?operasi=select_by_idnama";
			System.out.println("URL Tampil Kreditor: " + url);
			response = call(url);
		}catch(Exception e){
		}
		return response;
	}
	
	//insert motor
	public String insertMotor(String kdmotor, String nama, String harga){
		nama = nama.replace(" ", "%20");
		try{
			url = URL + "?operasi=insert&kdmotor=" + kdmotor + "&nama=" +
		nama + "&harga=" + harga;
			System.out.println("URL Insert Motor : " + url);
			response = call(url);
		}catch(Exception e){
		}
		return response;
	}
	
	//get motor by kdmotor
	public String getMotorByKdmotor(int idmotor){
		try{
			url = URL + "?operasi=get_motor_by_kdmotor&idmotor=" + idmotor;
			System.out.println("URL Get Motor: " + url);
			response = call(url);
		}catch(Exception e){
		}
		return response;
	}
	
	//select by kdmotorkredit
	public String select_by_KdmotorKredit(String kdmotor){
		try{
			url = URL + "?operasi=select_by_kdmotorkredit&kdmotor=" + kdmotor;
			System.out.println("URL Get Motor: " + url);
			response = call(url);
		}catch(Exception e){
		}
		return response;
	}
	
	//update motor
	public String updateMotor(String idmotor, String kdmotor, String nama, String harga){
		nama = nama.replace(" ", "%20");
		kdmotor = kdmotor.replace(" ", "%20");
		try{
			url = URL + "?operasi=update&idmotor=" + idmotor + "&kdmotor=" + kdmotor +
					"&nama=" + nama + "&harga=" + harga;
			System.out.println("URL Update Motor: " + url);
			response = call(url);
		}catch(Exception e){
		}
		return response;
	}
	
	//hapus motor
	public String deleteMotor(int idmotor){
		try{
			url = URL + "?operasi=delete&idmotor=" + idmotor;
			System.out.println("URL Hapus Motor: " + url);
			response = call(url);
		}catch(Exception e){
		}
		return response;
	}
	
	public long getId() {
		// TODO Auto-generated method stub
		return id;
		//return null;
		}
}