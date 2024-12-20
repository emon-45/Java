package candidates;



public class AwamiLeague extends Candidates{
	private String candidateName;
	public AwamiLeague(String candidateName){
		this.candidateName = candidateName;
	}

	public String getCandidateName()
	{
		return this.candidateName;
	}
}