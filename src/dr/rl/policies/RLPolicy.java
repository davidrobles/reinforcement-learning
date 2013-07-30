package dr.rl.policies;

import dr.rl.RLEnv;
import dr.rl.valuefunctions.QFunction;
import dr.rl.valuefunctions.VFunction;

/**
 * A Reinforcement Learning Policy.
 * @param <S> the type of the states
 * @param <A> the type of the actions
 */
public interface RLPolicy<S, A>
{
    A getAction(RLEnv<S, A> env, QFunction<S, A> qFunc);

    A getAction(RLEnv<S, A> env, VFunction<S> vFunc);
}
