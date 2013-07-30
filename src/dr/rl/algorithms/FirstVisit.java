package dr.rl.algorithms;

import dr.rl.Learner;
import dr.rl.RLEnv;
import dr.rl.policies.RLPolicy;
import dr.rl.valuefunctions.TabularVFunction;
import dr.rl.valuefunctions.VFunctionObserver;

import java.util.*;

public class FirstVisit<S, A> implements Learner
{
    // Lists all the states visited in the current episode
    private LinkedHashSet<S> visitedStates = new LinkedHashSet<S>();

    // Rewards
    private List<Double> rewards = new ArrayList<Double>();

    // Maps a state with a list of its returns
    private Map<S, List<Double>> stateReturns = new HashMap<S, List<Double>>();

    // Maps a state to the step of its first visit
    private Map<S, Integer> stateFirstOcc = new HashMap<S, Integer>();

    private RLEnv<S, A> env;
    private int numEpisodes;
    private int currentStep = 0;
    private List<VFunctionObserver<S>> observers = new ArrayList<VFunctionObserver<S>>();
    private TabularVFunction<S> vFunction;
    private RLPolicy<S, A> policy;

    public FirstVisit(RLEnv<S, A> env, RLPolicy<S, A> policy, int numEpisodes)
    {
        this.env = env;
        this.policy = policy;
        this.numEpisodes = numEpisodes;
        vFunction = new TabularVFunction<S>();
    }

    @Override
    public void learn()
    {

    }
}
