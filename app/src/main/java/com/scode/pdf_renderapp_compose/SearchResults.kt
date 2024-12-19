package com.scode.pdf_renderapp_compose

import android.graphics.RectF

data class SearchResults(
    val page: Int,
    val results: List<RectF>
)
