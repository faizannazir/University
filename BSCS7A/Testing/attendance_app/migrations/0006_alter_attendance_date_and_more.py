# Generated by Django 4.1.4 on 2023-03-08 06:31

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('attendance_app', '0005_leave'),
    ]

    operations = [
        migrations.AlterField(
            model_name='attendance',
            name='date',
            field=models.DateField(auto_now_add=True),
        ),
        migrations.AlterUniqueTogether(
            name='attendance',
            unique_together={('employee', 'date')},
        ),
    ]
