# mvp
Java版mvp模式

1.采用rxjava2+retrofit2+okhttp3开发整合

2.后续整合成jar包

### 使用
# 首先添加依赖

    allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
	
    dependencies {
	        implementation 'com.github.wangtonggen:mvp:1.0'
	}
# 具体使用

1.创建activity 需要继承BaseActivity

例如：

public class MainActivity extends BaseActivity{

}

2.mvp中的view需要继承BaseView

3.mvp中的presenter需要继承IBasePresenter

4.mvp中的model需要继承BaseModel
