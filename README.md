# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 02-15-dependencia-opcional-autowired
git add .
git commit -m "Dependência opcional com @Autowired"
git push origin 02-15-dependencia-opcional-autowired

git checkout master
git merge --no-ff 02-15-dependencia-opcional-autowired
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```