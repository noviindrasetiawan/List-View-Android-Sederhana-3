package com.example.listviewpresiden.Model

import com.example.listviewpresiden.R

object PresidenData {
    private val presidenName = arrayOf(
        "Soekarno",
        "Soeharto",
        "BJ Habibie",
        "Abdurrahman Wahid",
        "Megawati Soekarno Putri",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo"
    )

    private val detail = arrayOf(
        "Presiden Ke-1," +
                " 18 Agustus 1945 - 12 Maret 1967",
        "Presiden Ke-2," +
                " 12 Maret 1967 - 21 Mei 1998",
        "Presiden Ke-3," +
                " 21 Mei 1998 - 20 Oktober 1999",
        "Presiden Ke-4," +
                " 20 Oktober 1999 - 23 Juli 2001",
        "Presiden Ke-5," +
                " 23 Juli 2001 - 20 Oktober 2004",
        "Presiden Ke-6," +
                " 20 Oktober 2004 - 20 Oktober 2014",
        "Presiden Ke-7," +
                " 20 Oktober 2014 - Sampai Sekarang"
    )

    private val presidenPoster = intArrayOf(
        R.drawable.presiden1,
        R.drawable.presiden2,
        R.drawable.presiden3,
        R.drawable.presiden4,
        R.drawable.presiden5,
        R.drawable.presiden6,
        R.drawable.presiden7
    )

    val listPresiden: ArrayList<Presiden>
        get() {
            val list = arrayListOf<Presiden>()
            for (position in presidenName.indices) {
                val presiden = Presiden()
                presiden.name = presidenName[position]
                presiden.detail = detail[position]
                presiden.poster = presidenPoster[position]
                list.add(presiden)
            }
            return list
        }
}