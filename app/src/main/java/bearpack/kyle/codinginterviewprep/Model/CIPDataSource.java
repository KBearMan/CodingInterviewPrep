package bearpack.kyle.codinginterviewprep.Model;

import android.arch.lifecycle.LiveData;

import java.util.List;

/**
 * Created by Shiva on 3/15/2018.
 */

public interface CIPDataSource
{
    public LiveData<List<Algorithm>> getAllAlgos();

    public LiveData<List<Algorithm>> getAllAlgoByIDs(int[] algoIds);

    public Algorithm getAlgoByName(String name);

    public List<Algorithm> getAlgoByBigO(String bigO);

    public void addAlgos(Algorithm... algorithms);

    public void deleteAlgo(Algorithm algorithm);

}
