package guru.springframework.spring5jokesappv2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes; // best practice

//	public JokeServiceImpl() {
//		this.chuckNorrisQuotes = new ChuckNorrisQuotes();   // should be using Spring auto-wiring here, but not yet covered in the course. Instead we're hard-coding.
//	}
	
	/**
	 * Refactored constructor to inject the ChuckNorrisQuotes bean
	 * 
	 *  @param chuckNorrisQuotes
	 */
	@Autowired
	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke() {

		return chuckNorrisQuotes.getRandomQuote();
	}
}
