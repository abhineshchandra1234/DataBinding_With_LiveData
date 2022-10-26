<h1 align="center">Data Binding</h1>

<h3 align="center"><i>"Update layout directly through data source"</i></h3>
<p align="center">
This project explains about LiveData using a simple counter app. It follows all the best practices used for LiveData.
    </p>
    
---

## LiveData
- LiveData is an observable data holder class. It is lifecycle aware.
- It only updates app component observers like activities, fragments, or services when they are in an active lifecycle state.
- We could have implemented this project through only ViewModel. It would have handled the configuration change and will work the same but the major difference is that in ViewModel we need to update ui manually and it lags alot bcs to this and you can easily notice the difference in UX.

![LiveData](https://github.com/abhineshchandra1234/LiveDataApp/blob/master/images/LiveData.png)

---

## App Screenshots

![potrait](https://github.com/abhineshchandra1234/LiveDataApp/blob/master/images/potrait.png) 
![landscape](https://github.com/abhineshchandra1234/LiveDataApp/blob/master/images/landscape.png)

---

### 1. Gradle Setup
Add `ViewModel` and `LiveData` dependency on app level gradle file

<details>
  <summary><b>Android (Gradle - APP)</b></summary>

```kotlin
    //ViewModel
    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1'
    //LiveData
    implementation 'androidx.lifecycle:lifecycle-livedata-ktx:2.5.1'
```
</details>

---

### 2. ViewModel and LiveData declaration
- You can see in the code below we have create a ViewModel class. 
- Inside this we have created countObject as MutableLiveData object with default value as 0. We have created another LiveData object count. 
- MutableLiveData is generally used inside the ViewModel and updated inside it only as you can see with increment method.
- ViewModel exposes Immutable LiveData object here count to fetch MutableLiveData countObject value. It also restrict observers from changing the LiveData value.

<details>
  <summary><b>MainViewModel.kt</b></summary>

```kotlin
   class MainViewModel : ViewModel() {
    private val countObject = MutableLiveData<Int>(0)

    val count : LiveData<Int> get() = countObject

    fun increment() {
        countObject.value = countObject.value?.plus(1)
    }
}
```
</details>
    
---
    
### 3. Observe LiveData and update UI automatically
- You can see in the below code we are observing the LiveData value change and updatiing the UI with the latest data.
- we observe LiveData to avoid making unnecessary calls from an activity or fragment onResume() method and to ensure that view has some data to display as soon as it 
 is created.
    
<details>
  <summary><b>MainActivity.kt</b></summary>

```kotlin
   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel.count.observe(this) {
            setText(it)
        }
    }
```
</details>

---

> **Note**  
> For complete code checkout the LiveData github repo
    
---
   
### See Also
- [ViewModelApp](https://github.com/abhineshchandra1234/ViewModelApp)
---

### References
- [https://youtu.be/UGBHHkUyL5c](https://youtu.be/UGBHHkUyL5c)
- [https://developer.android.com/topic/libraries/architecture/livedata](https://developer.android.com/topic/libraries/architecture/livedata)

---

## 📝 License

```
Copyright 2022 Abhinesh Chandra

Licensed under the Apache License, Version 2.0 (the "License");

you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
