package br.com.gulliver.project.parques.servlet;

public class Parque {

	private int id;
	private String nome;
	private String descricao;
	private String localizacao;
	private String horarioFuncionamento;
	private String urlSiteOficial;
	private String legenda;
	private String imagem;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getHorarioFuncionamento() {
		return horarioFuncionamento;
	}
	public void setHorarioFuncionamento(String horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}
	public String getUrlSiteOficial() {
		return urlSiteOficial;
	}
	public void setUrlSiteOficial(String urlSiteOficial) {
		this.urlSiteOficial = urlSiteOficial;
	}
	public String getLegenda() {
		return legenda;
	}
	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	

}