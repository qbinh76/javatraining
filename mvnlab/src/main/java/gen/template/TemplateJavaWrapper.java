/*
 * This class has been generated. Do not change it, if you need to modify functionality - subclass it 
*/

package gen.template;

import org.openl.util.Log;
import org.openl.util.RuntimeExceptionWrapper;
import org.openl.types.java.OpenClassHelper;
import org.openl.types.IOpenClass;
import org.openl.conf.IUserContext;
import org.openl.conf.UserContext;
import org.openl.impl.OpenClassJavaWrapper;

public class TemplateJavaWrapper implements org.openl.main.OpenLWrapper,com.wirecard.issuing.context.IRulesRuntimeContextProvider,com.wirecard.issuing.context.IRulesRuntimeContextConsumer
{
  java.lang.Object __instance;

  public static org.openl.types.IOpenClass __class;

  public static org.openl.CompiledOpenClass __compiledClass;

  public static java.lang.String __openlName = "org.openl.xls";

  public static java.lang.String __src = "d:\\projects\\OpenL\\Util\\trunk\mvnlab/src/main/resources/rules/TemplateRules.xls";

  public static java.lang.String __srcModuleClass = null;

  public static java.lang.String __folder = "rules";

  public static java.lang.String __project = "mvnlab";

  public static java.lang.String __userHome = ".";

  private ThreadLocal<org.openl.vm.IRuntimeEnv> __env = new ThreadLocal<org.openl.vm.IRuntimeEnv>(){
    @Override
    protected org.openl.vm.IRuntimeEnv initialValue() {
      org.openl.vm.IRuntimeEnv environment = new org.openl.vm.SimpleVM().getRuntimeEnv();
      environment.setContext(new com.wirecard.issuing.context.DefaultRulesRuntimeContext());
      return environment;
    }
  };

  public org.openl.vm.IRuntimeEnv getRuntimeEnvironment() {
    return __env.get();
  }

  public void setRuntimeEnvironment(org.openl.vm.IRuntimeEnv environment) {
    __env.set(environment);
  }

  public com.wirecard.issuing.context.IRulesRuntimeContext getRuntimeContext() {
    return (com.wirecard.issuing.context.IRulesRuntimeContext)getRuntimeEnvironment().getContext();
  }

  public void setRuntimeContext(com.wirecard.issuing.context.IRulesRuntimeContext context) {
    getRuntimeEnvironment().setContext(context);
  }

  public TemplateJavaWrapper(){
    this(false);
  }

  public TemplateJavaWrapper(boolean ignoreErrors){
    __init();
    if (!ignoreErrors) __compiledClass.throwErrorExceptionsIfAny();
    __instance = __class.newInstance(__env.get());
  }



  static org.openl.types.IOpenField this_Field;

  public org.openl.types.impl.DynamicObject getThis()
  {
   Object __res = this_Field.get(__instance, __env.get());
   return (org.openl.types.impl.DynamicObject)__res;
  }


  public void setThis(org.openl.types.impl.DynamicObject __var)
  {
   this_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenMethod hello1_Method;
  public void hello1(int hour)  {
    Object[] __params = new Object[1];
    __params[0] = new Integer(hour);
    try
    {
    Object __myInstance = __instance;
    hello1_Method.invoke(__myInstance, __params, __env.get());  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }
  static boolean __initialized = false;

  static public void reset(){__initialized = false;}

public Object getInstance(){return __instance;}

public IOpenClass getOpenClass(){return __class;}

public org.openl.CompiledOpenClass getCompiledOpenClass(){return __compiledClass;}

public synchronized void  reload(){reset();__init();__instance = __class.newInstance(__env.get());}

  static synchronized protected void __init()
  {
    if (__initialized)
      return;

    IUserContext ucxt = UserContext.makeOrLoadContext(Thread.currentThread().getContextClassLoader(), __userHome);
    OpenClassJavaWrapper wrapper = OpenClassJavaWrapper.createWrapper(__openlName, ucxt , __src, __srcModuleClass);
    __compiledClass = wrapper.getCompiledClass();
    __class = wrapper.getOpenClassWithErrors();
   // __env.set(wrapper.getEnv());

    this_Field = __class.getField("this");
    hello1_Method = __class.getMatchingMethod("hello1", new IOpenClass[] {
      OpenClassHelper.getOpenClass(__class, int.class)});

    __initialized=true;
  }
}