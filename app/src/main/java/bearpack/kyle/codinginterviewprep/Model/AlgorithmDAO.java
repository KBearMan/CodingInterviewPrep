package bearpack.kyle.codinginterviewprep.Model;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Shiva on 3/15/2018.
 */
@Dao
public abstract class AlgorithmDAO implements CIPDataSource
{
    @Query("SELECT * FROM Algorithm")
    abstract public LiveData<List<Algorithm>> getAllAlgos();

    @Query("SELECT * FROM Algorithm WHERE uid IN (:algoIds)")
    abstract public LiveData<List<Algorithm>> getAllAlgoByIDs(int[] algoIds);

    @Query("SELECT * FROM Algorithm WHERE name LIKE :name LIMIT 1")
    abstract public Algorithm getAlgoByName(String name);

    @Query("SELECT * FROM Algorithm WHERE big_o LIKE :bigO")
    abstract public List<Algorithm> getAlgoByBigO(String bigO);

    @Insert
    abstract public void addAlgos(Algorithm... algorithms);

    @Delete
    abstract public void deleteAlgo(Algorithm algorithm);
}
