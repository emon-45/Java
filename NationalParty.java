package candidates;



public class NationalParty extends Candidates{
	private String candidateName;
	public NationalParty(String candidateName){
		this.candidateName = candidateName;
	}

	public String getCandidateName()
	{
		return this.candidateName;
	}
}