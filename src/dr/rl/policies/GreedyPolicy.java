package dr.rl.policies;

import dr.rl.RLEnv;
import dr.rl.valuefunctions.QFunction;
import dr.rl.valuefunctions.VFunction;

import java.util.List;

public class GreedyPolicy<S, A> implements RLPolicy<S, A>
{
    @Override
    public A getAction(RLEnv<S, A> env, QFunction<S, A> qFunc)
    {
        A bestAction = null;
        double bestValue = Double.NEGATIVE_INFINITY;
        List<A> actions = env.getPossibleActions(env.getCurrentState());

        for (A action : actions)
        {
            double value = qFunc.getValue(env.getCurrentState(), action);

            if (value > bestValue)
            {
                bestAction = action;
                bestValue = value;
            }
        }

        return bestAction;
    }

    @Override
    public A getAction(RLEnv<S, A> env, VFunction<S> vFunc)
    {
        A bestAction = null;
        double bestValue = Double.NEGATIVE_INFINITY;
        List<A> actions = env.getPossibleActions(env.getCurrentState());

        for (A action : actions)
        {
            double value = vFunc.getValue(env.getCurrentState());

            if (value > bestValue)
            {
                bestAction = action;
                bestValue = value;
            }
        }

        return bestAction;
    }
}
