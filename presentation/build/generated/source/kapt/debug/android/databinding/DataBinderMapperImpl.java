
package android.databinding;
import com.gmail.kishkevich.presentation.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.gmail.kishkevich.presentation.R.layout.activity_student:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_student_0".equals(tag)) {
                            return new com.gmail.kishkevich.presentation.databinding.ActivityStudentBindingImpl(bindingComponent, view);
                    }
                    if ("layout-land/activity_student_0".equals(tag)) {
                            return new com.gmail.kishkevich.presentation.databinding.ActivityStudentBindingLandImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_student is invalid. Received: " + tag);
                }
                case com.gmail.kishkevich.presentation.R.layout.item_student:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/item_student_0".equals(tag)) {
                            return new com.gmail.kishkevich.presentation.databinding.ItemStudentBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_student is invalid. Received: " + tag);
                }
                case com.gmail.kishkevich.presentation.R.layout.fragment_student_list:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/fragment_student_list_0".equals(tag)) {
                            return new com.gmail.kishkevich.presentation.databinding.FragmentStudentListBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for fragment_student_list is invalid. Received: " + tag);
                }
                case com.gmail.kishkevich.presentation.R.layout.fragment_student_details:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/fragment_student_details_0".equals(tag)) {
                            return new com.gmail.kishkevich.presentation.databinding.FragmentStudentDetailsBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for fragment_student_details is invalid. Received: " + tag);
                }
                case com.gmail.kishkevich.presentation.R.layout.activity_test:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_test_0".equals(tag)) {
                            return new com.gmail.kishkevich.presentation.databinding.ActivityTestBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_test is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -600779519: {
                if(tag.equals("layout/activity_student_0")) {
                    return com.gmail.kishkevich.presentation.R.layout.activity_student;
                }
                break;
            }
            case 1352980221: {
                if(tag.equals("layout-land/activity_student_0")) {
                    return com.gmail.kishkevich.presentation.R.layout.activity_student;
                }
                break;
            }
            case 1880846981: {
                if(tag.equals("layout/item_student_0")) {
                    return com.gmail.kishkevich.presentation.R.layout.item_student;
                }
                break;
            }
            case 624433469: {
                if(tag.equals("layout/fragment_student_list_0")) {
                    return com.gmail.kishkevich.presentation.R.layout.fragment_student_list;
                }
                break;
            }
            case 247261765: {
                if(tag.equals("layout/fragment_student_details_0")) {
                    return com.gmail.kishkevich.presentation.R.layout.fragment_student_details;
                }
                break;
            }
            case 628154894: {
                if(tag.equals("layout/activity_test_0")) {
                    return com.gmail.kishkevich.presentation.R.layout.activity_test;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"viewModel"};
    }
}