package com.example.androiddevchallenge.model

import com.example.androiddevchallenge.R

data class Doggo(
    val name: String,
    val photo: Int,
    val age: String,
    val gender: String,
    val shortDescription: String,
    val longDescription: Int = R.string.lorem,
) {
    companion object {
        fun getDoggoList(): ArrayList<Doggo> {
            return arrayListOf(
                Doggo(
                    "Sheroo",
                    R.drawable.doggo1,
                    "Puppy",
                    "Male",
                    "Like treats",
                ),
                Doggo(
                    "Baadal",
                    R.drawable.doggo2,
                    "Adult",
                    "Male",
                    "Looks like Cloud",
                ),
                Doggo(
                    "Hugsy",
                    R.drawable.doggo3,
                    "Adult",
                    "Female",
                    "Addictive to hugs",
                ),
                Doggo(
                    "Shishimanu",
                    R.drawable.doggo4,
                    "Puppy",
                    "Male",
                    "Whines like a baby",
                ),
            )
        }
    }
}
