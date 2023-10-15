public enum Sinal {
    VERMELHO("PARE"),
    AMARELO("ATENCAO"),
    VERDE("SIGA");
	
	private String acao;
	
    private Sinal(String acao)
    {
        this.acao = acao;
    }
	
	public String getAcao() {
		return this.acao;
	}
}
