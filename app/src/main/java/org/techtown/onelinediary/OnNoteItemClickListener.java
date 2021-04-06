package org.techtown.onelinediary;

import android.view.View;

interface OnNoteItemClickListener {
    public void onItemClick(NoteAdapter.ViewHolder holder, View view, int position);
}
