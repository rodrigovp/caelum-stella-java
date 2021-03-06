package aula06.r13.inlineclass.depois;

public class Empresa {

	private String razaoSocial;
	private String cnpj;
	private Endereco enderecoEntrega;
	private Endereco enderecoCobranca;

	public Empresa(String razaoSocial, String cnpj, Endereco enderecoEntrega, Endereco enderecoCobranca) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.enderecoEntrega = enderecoEntrega;
		this.enderecoCobranca = enderecoCobranca;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public Endereco getEnderecoCobranca() {
		return enderecoCobranca;
	}
}

class Endereco {

	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String municipio;
	private String uf;

	@Override
	public String toString() {
		return String.format("%s %s %s - %s - CEP %s - %s - %s", logradouro, numero, complemento, bairro, cep,
				municipio, uf);
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCEP() {
		return cep;
	}

	public void setCEP(String cep) {
		this.cep = cep;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUF() {
		return uf;
	}

	public void setUF(String uF) {
		this.uf = uF;
	}
}