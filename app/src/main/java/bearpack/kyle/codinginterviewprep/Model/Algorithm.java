package bearpack.kyle.codinginterviewprep.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Shiva on 3/15/2018.
 */

@Entity
public class Algorithm
{
    @PrimaryKey
    private int uid;

    public int getUid()
    {
        return uid;
    }

    public void setUid(int uid)
    {
        this.uid = uid;
    }

    public String getAlgoName()
    {
        return algoName;
    }

    public void setAlgoName(String algoName)
    {
        this.algoName = algoName;
    }

    public String getBig_o()
    {
        return big_o;
    }

    public void setBig_o(String big_o)
    {
        this.big_o = big_o;
    }

    public String getImageSRC()
    {
        return imageSRC;
    }

    public void setImageSRC(String imageSRC)
    {
        this.imageSRC = imageSRC;
    }

    @ColumnInfo(name = "name")
    private String algoName;

    @ColumnInfo(name = "big_o")
    private String big_o;

    @ColumnInfo(name = "image")
    private String imageSRC;
}
