# Generated by Django 4.1.4 on 2023-03-17 10:49

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('attendance_app', '0011_alter_attendance_status'),
    ]

    operations = [
        migrations.AlterField(
            model_name='attendance',
            name='entrance_time',
            field=models.TimeField(blank=True, null=True),
        ),
    ]
