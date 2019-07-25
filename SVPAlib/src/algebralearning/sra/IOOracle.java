package algebralearning.sra;

import automata.sra.SRA;
import org.sat4j.specs.TimeoutException;
import theory.characters.CharPred;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOOracle extends Oracle<CharPred, Character> {
	
	private Scanner sc;
	
	public IOOracle() {
		sc = new Scanner(System.in);
	}

	@Override
	public List<Character> checkEquivalenceImpl(SRA<CharPred, Character> compareTo) throws TimeoutException {
		List<Character> ret = new ArrayList<>();
		// System.out.println(compareTo);
		System.out.println("Is that your automaton? (y/n):");
		char in = sc.nextLine().charAt(0);
		if (in == 'y')
			return null;
		System.out.println("Enter counterexample string a1,a2,a3... :");
		String cex = sc.nextLine();
		for (String s : cex.split(","))
			ret.add(s.charAt(0));
		return ret;
	}

	@Override
	public boolean checkMembershipImpl(List<Character> w) {
		System.out.println("Does your automaton accept " + w + " ? (y/n):");
		char in = sc.nextLine().charAt(0);
		return in == 'y';
	}

}
