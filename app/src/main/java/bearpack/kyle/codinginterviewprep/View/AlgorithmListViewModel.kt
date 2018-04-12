package bearpack.kyle.codinginterviewprep.View

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import bearpack.kyle.codinginterviewprep.Model.Algorithm
import bearpack.kyle.codinginterviewprep.Model.CodingDatabase


/**
 * Created by Shiva on 3/15/2018.
 */

class AlgorithmListViewModel(application: Application) : AndroidViewModel(application)
{
    val algorithmList: LiveData<List<Algorithm>>

    private val appDatabase: CodingDatabase

    init
    {
        var tempList = mutableListOf<Algorithm>()
        tempList.add(Algorithm().apply {uid=0
                                        algoName="QuickSort"
                                        big_o="O(n^2)"
                                        imageSRC=""})
        tempList.add(Algorithm().apply {uid=1
            algoName="MergeSort"
            big_o="O(nlog(n))"
            imageSRC=""})
        tempList.add(Algorithm().apply {uid=2
            algoName="TimSort"
            big_o="O(nlog(n))"
            imageSRC=""})
        tempList.add(Algorithm().apply {uid=3
            algoName="HeapSort"
            big_o="O(nlog(n))"
            imageSRC=""})
        tempList.add(Algorithm().apply {uid=4
            algoName="BubbleSort"
            big_o="O(n^2)"
            imageSRC=""})
        tempList.add(Algorithm().apply {uid=5
            algoName="InsertionSort"
            big_o="O(n^2)"
            imageSRC=""})
        tempList.add(Algorithm().apply {uid=6
            algoName="SelectionSort"
            big_o="O(n^2)"
            imageSRC=""})
        tempList.add(Algorithm().apply {uid=7
            algoName="TreeSort"
            big_o="O(n^2)"
            imageSRC=""})


        algorithmList = MutableLiveData<List<Algorithm>>()
        algorithmList.value = tempList
        appDatabase = CodingDatabase.getDatabase(this.getApplication<Application>())
        //algorithmList = appDatabase.algorithmDAO().getAllAlgos()
    }
}