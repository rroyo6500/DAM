import 'package:flutter/material.dart';

class SectionSeparator extends StatelessWidget {
  const SectionSeparator({super.key});

  @override
  Widget build(BuildContext context) {
    return Container(
      width: MediaQuery.widthOf(context),
      height: 2,
      color: Colors.black,
    );
  }
}
