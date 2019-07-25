package algebralearning.sra;

import org.sat4j.specs.TimeoutException;
import theory.BooleanAlgebra;
import algebralearning.sra.Learner;
import algebralearning.sra.Oracle;
import theory.intervals.UnaryCharIntervalSolver;
import theory.characters.CharPred;

public class SRALearningTest {

    public static void main(String[] args) {
        UnaryCharIntervalSolver ba = new UnaryCharIntervalSolver();
        Oracle<CharPred, Character> o = new IOOracle();

        Learner<CharPred, Character> l = new Learner<>();

        try {
            l.learn(o, ba);
        }
        catch(TimeoutException e) {}
    }
}
