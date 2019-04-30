package com.asoto.masterdetailwordpress.dummy

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<DummyItem> = ArrayList()

    val LOGTAG = "SEGUIMIENTO"

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    private val COUNT = 25

    init {


        //for (i in 1..COUNT) {
            //addItem(createDummyItem(i))
        //}

    }

    fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }


    //private fun createDummyItem(position: Int): DummyItem {
    //    return DummyItem(position.toString(), "Item " + position, makeDetails(position))
    //}


    /*private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }*/



    /**
     * A dummy item representing a piece of content.
     */
    data class DummyItem(val id: String, val titulo: String, val details: String) {
        override fun toString(): String {
            return "El título es: $titulo"
        }
    }
}