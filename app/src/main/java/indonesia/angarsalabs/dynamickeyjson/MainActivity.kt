package indonesia.angarsalabs.dynamickeyjson

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = mutableListOf<ModelData>();
        list = ModelDataGSON().getModelDataList()

        val adapter = MainAdapter(list)
        rv_content.layoutManager = LinearLayoutManager(this)
        rv_content.adapter = adapter
        adapter.notifyDataSetChanged()
    }
}
