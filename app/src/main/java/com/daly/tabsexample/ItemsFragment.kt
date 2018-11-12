package com.daly.tabsexample


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.fragment_items.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ItemsFragment : Fragment() {

    public fun newInstance(categoryId: Int): Fragment {
        var fragment: Fragment = ItemsFragment();

        var bundle: Bundle = Bundle()
        bundle.putInt("category_id", categoryId)
        fragment.arguments = bundle
        return fragment;
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view: View = inflater.inflate(R.layout.fragment_items, container, false)

        var items = ArrayList<ItemModel>()
        items.add(ItemModel("Hi"))
        items.add(ItemModel("Hi"))
        items.add(ItemModel("Hi"))
        items.add(ItemModel("Hi"))
        items.add(ItemModel("Hi"))
        items.add(ItemModel("Hi"))
        val mListView = view.findViewById(R.id.mListView) as ListView
        mListView.adapter = ItemAdapter(activity!!.getApplicationContext(), items)

        return view
    }


}
