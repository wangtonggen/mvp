# mvp
Java版mvp模式

1.采用rxjava2+retrofit2+okhttp3开发整合

2.后续整合成jar包

# 使用
## 首先添加依赖

    allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
	
    dependencies {
	        implementation 'com.github.wangtonggen:mvp:1.0.2'
	}
## 具体使用

1.初始化建议在application中初始化

//设置okhttp

ServiceFactory.getInstance().setOkHttpClient(OkHttpClient.Builder builder);

//设置域名

ServiceFactory.getInstance().setBaseUrl(String base_url)

2.创建activity 需要继承BaseActivity fragment(v4)继承BaseFragment

例如：

public class MainActivity extends BaseActivity{

}

public class MyFragment extends BaseFragment {

}

3.mvp中的view需要继承BaseView

4.mvp中的presenter需要继承IBasePresenter

5.mvp中的model需要继承BaseModel

## 计划
1.加入butterknife注册控件

2.准备初始化数据的工作分离出来

3.使用更方便只设置相应的参数就可以使用
