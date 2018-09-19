package qt14_mediator;
public class ProfessorColleague extends Colleague {

	public ProfessorColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("Professor recebeu: " + mensagem);
	}

}
