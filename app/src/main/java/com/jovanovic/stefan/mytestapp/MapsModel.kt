// 13-08-2021 - Gifar Fadillah Suryana - 10118378
package com.jovanovic.stefan.mytestapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class MapsModel (
    var gambar: String = "",
    var keterangan: String = "",
    var latitude: Double = 0.0,
    var longitude: Double = 0.0,
    var nama: String = ""
) : Parcelable