package bearpack.kyle.codinginterviewprep.View

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import bearpack.kyle.codinginterviewprep.Model.Algorithm
import bearpack.kyle.codinginterviewprep.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    var algorithmVM : AlgorithmListViewModel? = null
    var recyclerViewAdapter : AlgorithmRecyclerViewAdapter? = null
    var clickListener : View.OnClickListener = View.OnClickListener {  }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerViewAdapter = AlgorithmRecyclerViewAdapter(mutableListOf<Algorithm>(),clickListener)
        algorithm_recycler_view.adapter = recyclerViewAdapter
        algorithm_recycler_view.layoutManager = LinearLayoutManager(this)
        algorithmVM = ViewModelProviders.of(this).get(AlgorithmListViewModel::class.java)
        algorithmVM!!.algorithmList.observe(this@MainActivity, object : Observer<List<Algorithm>>
        {
            override fun onChanged(t: List<Algorithm>?)
            {
                recyclerViewAdapter!!.addItems(t)
            }
        })
    }
}
