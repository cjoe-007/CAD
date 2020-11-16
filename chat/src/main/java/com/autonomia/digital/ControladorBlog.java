package com.autonomia.digital;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.autonomia.digital.to.ObjetoBlog;
import com.google.gson.Gson;

@Named
@ViewScoped
public class ControladorBlog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ObjetoBlog objetoBlog;
	private String separador = "------------------------------------------------------------";
	FileWriter flwriter = null;
	List<ObjetoBlog> listObjetoBlog;

	@PostConstruct
	public void init() {
		objetoBlog = new ObjetoBlog();
		objetoBlog.setBlog(new StringBuilder());
		listObjetoBlog = new ArrayList<>();
		leerArchivo();
	}

	public void crearBlog() {
		objetoBlog.setFecha(String.valueOf(LocalDateTime.now()));
		crearArchivo(objetoBlog);
	}

	public void guardarBlog() {
		if (objetoBlog.blog.length() > 0) {
			objetoBlog.getBlog().append("Usuario: " + objetoBlog.getUsuarioResponde());
			objetoBlog.getBlog().append("<br/>");
			objetoBlog.getBlog().append("Fecha: " + LocalDateTime.now());
			objetoBlog.getBlog().append("<br/>");
			objetoBlog.getBlog().append("<br/>");
			objetoBlog.getBlog().append(objetoBlog.getBlogResponde());
			objetoBlog.getBlog().append("<br/>");
			objetoBlog.getBlog().append(separador);
			objetoBlog.getBlog().append("<br/>");
			objetoBlog.getBlog().append("<br/>");
		} else {
			objetoBlog.getBlog().append(objetoBlog.getBlogResponde());
			objetoBlog.getBlog().append("<br/>");
			objetoBlog.getBlog().append(separador);
			objetoBlog.getBlog().append("<br/>");
			objetoBlog.getBlog().append("<br/>");
		}
		crearArchivo(objetoBlog);
		objetoBlog.setUsuarioResponde("");
		objetoBlog.setBlogResponde("");
	}

	public void crearArchivo(ObjetoBlog objetoBlog) {
		Gson gson = new Gson();
		String JSON = gson.toJson(objetoBlog);
		try {
			flwriter = new FileWriter("blogs.txt");
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			bfwriter.write(JSON);
			bfwriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void leerArchivo() {
		File file = new File("blogs.txt");
		if (file.exists()) {
			Scanner scanner;
			try {
				scanner = new Scanner(file);
				Gson gson = new Gson();
				while (scanner.hasNextLine()) {
					String linea = scanner.nextLine();
					ObjetoBlog obj = gson.fromJson(linea, ObjetoBlog.class);
					obj.setBlogResponde("");
					obj.setUsuarioResponde("");
					listObjetoBlog.add(obj);
				}

				// se cierra el ojeto scanner
				scanner.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	public void cargarBlog() {
		for (ObjetoBlog objBlog : listObjetoBlog) {
			objetoBlog = objBlog;
		}
	}

	public ObjetoBlog getObjetoBlog() {
		return objetoBlog;
	}

	public void setObjetoBlog(ObjetoBlog objetoBlog) {
		this.objetoBlog = objetoBlog;
	}

	public List<ObjetoBlog> getListObjetoBlog() {
		return listObjetoBlog;
	}

	public void setListObjetoBlog(List<ObjetoBlog> listObjetoBlog) {
		this.listObjetoBlog = listObjetoBlog;
	}

}
