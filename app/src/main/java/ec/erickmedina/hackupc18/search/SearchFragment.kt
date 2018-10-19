package ec.erickmedina.hackupc18.search

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import ec.erickmedina.hackupc18.R
import ec.erickmedina.hackupc18.entities.Search

class SearchFragment : Fragment(), SearchContract.SearchView {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?)
            = inflater.inflate(R.layout.layout_search, container, false)


    override fun onJobSearchSuccess(searchResults: List<Search>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onJobSearchError(error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}