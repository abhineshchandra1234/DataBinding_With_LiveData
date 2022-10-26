<h1 align="center">Data Binding</h1>

<h3 align="center"><i>"Update layout directly through data source"</i></h3>
<p align="center">
This project explains how to use Data Binding with LiveData.
    </p>
    
---

## DataBinding
- As the name suggests, the data binding library allows us to bind UI components of the layout with data sources declaratively rather than programmatically.
---

## One-Way DataBinding
- In one-way data binding, only the data source can update the views on data change, views cannot update the data source.
- android:text=”@{employee.name}”
![LiveData](https://github.com/abhineshchandra1234/LiveDataApp/blob/master/images/LiveData.png)
---

## Two-Way DataBinding
- Both the view and data source are in sync. Every change in view will be reflected on the data source and vice versa.
- android:text=”@={mainViewModel.nameLiveData}”
---

## App Screenshots

![LiveData1](https://github.com/abhineshchandra1234/DataBinding_With_LiveData/blob/master/screenshots/LiveData1.png) 
![LiveData2](https://github.com/abhineshchandra1234/DataBinding_With_LiveData/blob/master/screenshots/LiveData2.png)

---

### References
- [https://youtu.be/TVlpENKIg2A](https://youtu.be/TVlpENKIg2A)
- [https://www.codementor.io/@elirangoshen/android-data-binding-5wnz20h6x](https://www.codementor.io/@elirangoshen/android-data-binding-5wnz20h6x)
- [https://medium.com/@abhineshchandra1234/data-binding-in-kotlin-ac70f63396aa](https://medium.com/@abhineshchandra1234/data-binding-in-kotlin-ac70f63396aa)

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
