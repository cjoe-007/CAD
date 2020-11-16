package com.autonomia.digital.to;

public class ObjetoBlog {
	public int id;
	public String usuario;
	public String titulo;
	public StringBuilder blog;
	public String usuarioResponde;
	public int orden;
	public String blogResponde;
	public String fecha;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public StringBuilder getBlog() {
		return blog;
	}

	public void setBlog(StringBuilder blog) {
		this.blog = blog;
	}

	public String getUsuarioResponde() {
		return usuarioResponde;
	}

	public void setUsuarioResponde(String usuarioResponde) {
		this.usuarioResponde = usuarioResponde;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public String getBlogResponde() {
		return blogResponde;
	}

	public void setBlogResponde(String blogResponde) {
		this.blogResponde = blogResponde;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
