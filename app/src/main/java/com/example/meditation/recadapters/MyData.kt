package com.example.meditation.recadapters

import com.example.meditation.R

data class feel(val image: Int, val name_feel: String)
class MyFeel {
    val list = arrayListOf(
        feel(R.drawable.calm, "Спокойным"),
        feel(R.drawable.focus, "Сфокусированным"),
        feel(R.drawable.anxious, "Тревожным"),
        feel(R.drawable.relax, "Chill"),
        feel(R.drawable.calm, "Обычным")
    )

}

data class state(val Image: Int, val name_state: String, val text_state: String)
class MyState {
    val state_list = arrayListOf(
        state(R.drawable.state_image1, "Вставить текст", "Кратенькое описание блока с двумя строчками"),
        state(R.drawable.state_image2, "Вставить текст", "Кратенькое описание блока с двумя строчками"),
        state(R.drawable.state_image1, "Как отдохнуть?", "Кратенькое описание блока с двумя строчками")
    )
}
