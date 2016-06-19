package benchmark.regexconverter;

import java.util.ArrayList;

import org.sat4j.specs.TimeoutException;

import automata.safa.SAFA;
import automata.sfa.SFA;
import theory.characters.CharPred;
import theory.intervals.UnaryCharIntervalSolver;

public class TripleAut {
	UnaryCharIntervalSolver solver = new UnaryCharIntervalSolver();
	private int firstIndex;
	private int secondIndex;
	private int thirdIndex;
	private SAFA<CharPred, Character> mySAFA1;
	private SAFA<CharPred, Character> mySAFA2;
	private SAFA<CharPred, Character> mySAFA3;
	
	
	private SFA<CharPred, Character> mySFA1;
	private SFA<CharPred, Character> mySFA2;
	private SFA<CharPred, Character> mySFA3;

	
	public TripleAut(int index1, int index2, int index3, SAFA<CharPred, Character> safa1, SAFA<CharPred, Character> safa2, SAFA<CharPred, Character> safa3){
		this.firstIndex = index1;
		this.secondIndex = index2;
		this.thirdIndex = index3;
		this.mySAFA1 = safa1;
		this.mySAFA2 = safa2;
		this.mySAFA3 = safa3;
		
	}
	
	public TripleAut(int index1, int index2, int index3, SFA<CharPred, Character> sfa1, SFA<CharPred, Character> sfa2, SFA<CharPred, Character> sfa3){
		this.firstIndex = index1;
		this.secondIndex = index2;
		this.thirdIndex = index3;
		this.mySFA1 = sfa1;
		this.mySFA2 = sfa2;
		this.mySFA3 = sfa3;
		
	}
	
	public void setSFA(SFA<CharPred, Character> sfa1, SFA<CharPred, Character> sfa2, SFA<CharPred, Character> sfa3){
		this.mySFA1 = sfa1;
		this.mySFA2 = sfa2;
		this.mySFA3 = sfa3;
	}
	
	
	public ArrayList<SFA<CharPred, Character>> getSFAlist(){
		ArrayList<SFA<CharPred, Character>> sfaList = new ArrayList<SFA<CharPred, Character>>();
		sfaList.add(this.mySFA1);
		sfaList.add(this.mySFA2);
		sfaList.add(this.mySFA3);
		return sfaList;
	}
	
	public ArrayList<SAFA<CharPred, Character>> getSAFAlist(){
		ArrayList<SAFA<CharPred, Character>> safaList = new ArrayList<SAFA<CharPred, Character>>();
		safaList.add(this.mySAFA1);
		safaList.add(this.mySAFA2);
		safaList.add(this.mySAFA3);
		return safaList;
	}
	
	
	public ArrayList<Integer> getIndex(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(this.firstIndex);
		list.add(this.secondIndex);
		list.add(this.thirdIndex);
		return list;
	}
	
	public int getFirstIndex(){
		return this.firstIndex;
	}
	
	public int getSecondIndex(){
		return this.secondIndex;
	}
	
	public int getThirdIndex(){
		return this.thirdIndex;
	}
	
	
	
}