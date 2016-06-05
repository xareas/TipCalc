package edu.galileo.android.tipcalc.fragments;

import edu.galileo.android.tipcalc.model.TipRecord;

/**
 * Creado por xareas
 * Fecha 6/3/16.
 */
public interface ITipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
