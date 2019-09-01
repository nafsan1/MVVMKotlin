package com.example.kotlinmvvm.databinding;
import com.example.kotlinmvvm.R;
import com.example.kotlinmvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.Button mboundView3;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewModelKotlinOnLoginClickedAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModelKotlin == variableId) {
            setViewModelKotlin((com.example.kotlinmvvm.viewModel.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModelKotlin(@Nullable com.example.kotlinmvvm.viewModel.LoginViewModel ViewModelKotlin) {
        this.mViewModelKotlin = ViewModelKotlin;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModelKotlin);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.text.TextWatcher viewModelKotlinEmailTextWatcher = null;
        android.text.TextWatcher viewModelKotlinPasswordTextWatcher = null;
        android.view.View.OnClickListener viewModelKotlinOnLoginClickedAndroidViewViewOnClickListener = null;
        com.example.kotlinmvvm.viewModel.LoginViewModel viewModelKotlin = mViewModelKotlin;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModelKotlin != null) {
                    // read viewModelKotlin.emailTextWatcher
                    viewModelKotlinEmailTextWatcher = viewModelKotlin.getEmailTextWatcher();
                    // read viewModelKotlin.passwordTextWatcher
                    viewModelKotlinPasswordTextWatcher = viewModelKotlin.getPasswordTextWatcher();
                    // read viewModelKotlin::onLoginClicked
                    viewModelKotlinOnLoginClickedAndroidViewViewOnClickListener = (((mViewModelKotlinOnLoginClickedAndroidViewViewOnClickListener == null) ? (mViewModelKotlinOnLoginClickedAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelKotlinOnLoginClickedAndroidViewViewOnClickListener).setValue(viewModelKotlin));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView1.addTextChangedListener(viewModelKotlinEmailTextWatcher);
            this.mboundView2.addTextChangedListener(viewModelKotlinPasswordTextWatcher);
            this.mboundView3.setOnClickListener(viewModelKotlinOnLoginClickedAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.kotlinmvvm.viewModel.LoginViewModel value;
        public OnClickListenerImpl setValue(com.example.kotlinmvvm.viewModel.LoginViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onLoginClicked(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModelKotlin
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}