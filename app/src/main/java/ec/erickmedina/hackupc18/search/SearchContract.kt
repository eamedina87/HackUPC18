package ec.erickmedina.hackupc18.search

import ec.erickmedina.hackupc18.entities.Search

interface SearchContract {

    interface SearchView {
        fun onJobSearchSuccess(searchResults:List<Search>)
        fun onJobSearchError(error:String)
        fun showProgress()
        fun hideProgress()
    }

    interface SearchPresenter{
        fun doJobSearch(searchDescription:String)
    }

}