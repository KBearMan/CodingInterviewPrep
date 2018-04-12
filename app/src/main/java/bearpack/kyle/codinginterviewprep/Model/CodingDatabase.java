package bearpack.kyle.codinginterviewprep.Model;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by Shiva on 3/15/2018.
 */

@Database( entities = {Algorithm.class}, version = 1)
public abstract class CodingDatabase extends RoomDatabase
{

    private static CodingDatabase INSTANCE;

    public static CodingDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(), CodingDatabase.class, "CodingDatabase")
                            .build();
        }
        return INSTANCE;
    }

    public abstract AlgorithmDAO algorithmDAO();
}
