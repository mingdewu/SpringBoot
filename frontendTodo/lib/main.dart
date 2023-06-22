import 'package:flutter/material.dart';
import 'package:frontendtodo/Screens/HomeScreen.dart';
import 'package:provider/provider.dart';

import 'models/tasks_data.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return ChangeNotifierProvider<TasksData>(
      create: (context)=>TasksData(),
      child: MaterialApp(
        title: 'Flutter Demo',
        
        home:  const HomeScreen(),
      ),
    );
  }
}
