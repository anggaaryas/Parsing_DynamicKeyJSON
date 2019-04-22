package indonesia.angarsalabs.dynamickeyjson

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.recycler_view_item.*

/**
 * Angarsa Labs...!
 * Created by Angga on 4/22/2019.
 */
class MainAdapter(val items: MutableList<ModelData>) : RecyclerView.Adapter<MainAdapter.vh>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): vh {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.recycler_view_item, p0, false)
        return vh(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: vh, p1: Int) {
        p0.textView1.text = items[p1].kode
        p0.textView2.text = items[p1].nama
    }

    class vh(override val containerView : View) : RecyclerView.ViewHolder(containerView), LayoutContainer
}