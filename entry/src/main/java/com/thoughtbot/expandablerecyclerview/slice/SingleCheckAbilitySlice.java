package com.thoughtbot.expandablerecyclerview.slice;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.ComponentContainer;
import ohos.agp.components.LayoutScatter;
import com.anshul.expandablelistview.ResourceTable;
import com.thoughtbot.expandablerecyclerview.singlecheck.SingleCheckHelper;

/**
 * Single Check Abilty Slice.
 */
public class SingleCheckAbilitySlice extends AbilitySlice {

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        ComponentContainer rootView = (ComponentContainer) LayoutScatter.getInstance(this)
                .parse(ResourceTable.Layout_ability_singlecheck, null, false);
        super.setUIContent(rootView);
        SingleCheckHelper helper = new SingleCheckHelper(this, rootView);
        helper.initViews();
    }
}